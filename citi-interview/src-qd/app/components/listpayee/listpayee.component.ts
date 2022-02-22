import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Router} from '@angular/router';

@Component({
  selector: 'app-listpayee',
  templateUrl: './listpayee.component.html',
  styleUrls: ['./listpayee.component.css']
})
export class ListpayeeComponent implements OnInit {
  public pageInfo: any ;

  constructor(public http: HttpClient, public router: Router) {
  }

  ngOnInit(): void {
    const url = 'http://localhost:8080/api/payee';
    this.http.get(url).subscribe((response: any) => {
      this.pageInfo = response;
    });
  }
}
