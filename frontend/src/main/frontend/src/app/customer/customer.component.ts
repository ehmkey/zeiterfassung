import { Component, OnInit } from '@angular/core';
import { CUSTOMERS } from '../model/mock-customer-data';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  constructor() { }

  customers = CUSTOMERS;

  ngOnInit() {
  }

}
