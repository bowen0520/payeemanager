import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {NavigationExtras, Router} from '@angular/router';

@Component({
  selector: 'app-addpayee',
  templateUrl: './addpayee.component.html',
  styleUrls: ['./addpayee.component.css']
})
export class AddpayeeComponent implements OnInit {
  public apiHead = 'http://localhost:8080/'

  constructor(public http: HttpClient, public router: Router) {
  }

  public isHiddenLCA = true;
  public isHiddenLNCA = true;
  public payeeType: string;

  public payeetype: any;
  public bank: any;
  public currency: any;
  public purpose: any;

  public payee1: any = {
    payee_id: 0,
    type_message: null,
    payee_name: null,
    account_nickname: null,
    payee_account_number: null,
    to_account_type: null,
    bank_name: null,
    branch_code: null,
    branch_number: null,
    currency_type: null,
    purpose_of_transfer_type: null,
    message: null,
  };

  public payee2: any = {
    payee_id: 0,
    type_message: null,
    payee_name: null,
    account_nickname: null,
    payee_account_number: null,
    to_account_type: null,
    bank_name: null,
    branch_code: null,
    branch_number: null,
    currency_type: null,
    purpose_of_transfer_type: null,
    message: null,
  };

  ngOnInit(): void {
    const payeeTypeurl = this.apiHead + 'api/type/payee';
    this.http.get(payeeTypeurl).subscribe((response: any) => {
      this.payeetype = response;
    });

    const bankurl = 'http://localhost:8080/api/bank';
    this.http.get(bankurl).subscribe((response: any) => {
      this.bank = response;
    });

    const currencyurl = 'http://localhost:8080/api/currency';
    this.http.get(currencyurl).subscribe((response: any) => {
      this.currency = response;
    });

    const purposeurl = 'http://localhost:8080/api/purpose';
    this.http.get(purposeurl).subscribe((response: any) => {
      this.purpose = response;
    });
  }

  onSubmit1(): void {
    console.log(this.payee1);
    const api = 'http://localhost:8080/api/add';
    this.http.post(api, this.payee1).subscribe((response) => {
      const queryParams: NavigationExtras = {
        queryParams: {data: JSON.stringify(response)}
      };
      console.log(queryParams);
      this.router.navigate(['/listpayee'], queryParams);
    });
  }

  onSubmit2(): void {
    console.log(this.payee2);
    const api = 'http://localhost:8080/api/add';
    this.http.post(api, this.payee2).subscribe((response) => {
      const queryParams: NavigationExtras = {
        queryParams: {data: JSON.stringify(response)}
      };
      console.log(queryParams);
      this.router.navigate(['/listpayee'], queryParams);
    });
  }

  display(): void {
    if (this.payeeType === 'Local Citibank Account') {
      this.isHiddenLCA = false;
      this.isHiddenLNCA = true;
    }else if (this.payeeType === 'Local Non-Citibank Account'){
      this.isHiddenLCA = true;
      this.isHiddenLNCA = false;
    }else {
      this.isHiddenLCA = true;
      this.isHiddenLNCA = true;
    }
  }


}
