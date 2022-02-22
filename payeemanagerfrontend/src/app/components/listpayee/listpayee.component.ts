import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Router} from '@angular/router';
import * as $ from 'jquery';

@Component({
  selector: 'app-listpayee',
  templateUrl: './listpayee.component.html',
  styleUrls: ['./listpayee.component.css']
})
export class ListpayeeComponent implements OnInit {
  public pageInfo = [];
  public data = [];
  public size = 8;

  constructor(public http: HttpClient, public router: Router) {
  }

  ngOnInit(): void {
    const url = 'http://localhost:8080/api/payee';
    this.http.get(url).subscribe((response: []) => {
      this.pageInfo = response;
      console.log(this.pageInfo);
      // 总页数
      const totalCount = this.pageInfo.length;

      // 设置表格总页数
      let totalPage = 0;
      const pageSize = this.size;
      if (totalCount / pageSize > totalCount / pageSize) {
        totalPage = totalCount / pageSize + 1;
      } else {
        totalPage = totalCount / pageSize;
      }
      this.createBtns(totalPage, 1);
      this.bindClick();
      this.bindClickPage(totalPage);
      this.pagination(pageSize, 1);
    });
  }

  pagination(size: number, current: number): void {
    // 总页数
    const totalCount = this.pageInfo.length;
    // 设置表格总页数
    let totalPage = 0;
    let pageSize = this.size;
    if (totalCount / pageSize > totalCount / pageSize) {
      totalPage = totalCount / pageSize + 1;
    } else {
      totalPage = totalCount / pageSize;
    }
    // 清空表格
    pageSize = size;
    // 对数据进行分页
    const currentPage = current;
    const startRow = (currentPage - 1) * pageSize;
    const endRow = (currentPage * pageSize > totalCount ? totalCount : currentPage * pageSize);
    this.data = [];
    for (let i = startRow; i < endRow; i++) {
      const e = this.pageInfo[i];
      this.data.push(e);
    }
    console.log(this.data);
    this.createBtns(totalPage, current);
    this.bindClick();
  }

// 生成点击按钮
  createBtns(totalPages: number, current: number): void {
    let tempStr = '';
    // 上一页按钮
    if (current > 1) {
      tempStr += '<li><a href="javascript:;" class="btn prev" data-page = ' + (current - 1) + '>上一页</a></li>';
    }
    // 中间页码
    // 如果总页数超出5个处理办法
    if (totalPages <= 5) {
      for (let pageIndex = 1; pageIndex < totalPages + 1; pageIndex++) {
        tempStr += '<li><a href="javascript:;" class="btn page' +
          pageIndex + '" data-page = ' + (pageIndex) + '>' + pageIndex + '</a></li>';
      }
    } else {
      if (current < 5) {
        for (let pageIndex = 1; pageIndex < 5; pageIndex++) {
          tempStr += '<li><a href="javascript:;" data-page = ' + (pageIndex) + '>' + pageIndex + '</a></li>';
        }
        tempStr += '<li><a href="javascript:;">......</a></li>';
        tempStr += '<li><a href="javascript:;" data-page = ' + (totalPages) + '>' + totalPages + '</a></li>';
      } else if (current >= totalPages - 4) {
        tempStr += '<li><a href="javascript:;" data-page = ' + 1 + '>1</a></li>';
        tempStr += '<li><a href="javascript:;">......</a></li>';
        for (let pageIndex = totalPages - 4; pageIndex <= totalPages; pageIndex++) {
          tempStr += '<li><a href="javascript:;" data-page = ' + (pageIndex) + '>' + pageIndex + '</a></li>';
        }
      } else if (current >= 5 && current < totalPages - 4) {
        tempStr += '<li><a href="javascript:;" data-page = ' + 1 + '>1</a></li>';
        tempStr += '<li><a href="javascript:;">......</a></li>';
        for (let pageIndex = current; pageIndex <= current + 4; pageIndex++) {
          tempStr += '<li><a href="javascript:;" data-page = ' + (pageIndex) + '>' + pageIndex + '</a></li>';
        }
        tempStr += '<li><a href="javascript:;">......</a></li>';
        tempStr += '<li><a href="javascript:;" data-page = ' + (totalPages) + '>' + totalPages + '</a></li>';
      }
    }
    // 下一页按钮
    if (current < totalPages) {
      current++;
      tempStr += '<li><a href="javascript:;" class="btn next" data-page = ' + current + '>下一页</a></li>';
    }
    document.getElementById('pageination').innerHTML = tempStr;
  }

  bindClick(): void {
    // 设置首页、末页、上一页、下一页的点击事件
    const buttonArr = ['prev', 'next'];
    // tslint:disable-next-line: prefer-for-of
    for (let k = 0; k < buttonArr.length; k++) {
      const $dom = '.' + buttonArr[k];
      $('body').undelegate($dom, 'click').delegate($dom, 'click', (obj) => {
        const page = obj.target.dataset.page;
        this.pagination(this.size, page); // 对页面进行分页
        // 对当前页码的样式做处理
        $('.page' + page).css({background: '#0449d4', color: '#fff'})
          .siblings().css({background: '#fff', color: '#999'});
      });
    }
  }

  bindClickPage(totalPage: number): void {
    // 设置页码的点击事件
    for (let k = 1; k <= totalPage; k++) {
      const $singleDom = '.page' + k;
      $('body').delegate($singleDom, 'click', (obj) => {
        this.pagination(this.size, k);
      });
      $('.page' + k).css({background: '#0449d4', color: '#fff'})
        .siblings().css({background: '#fff', color: '#999'});
    }
  }
}
