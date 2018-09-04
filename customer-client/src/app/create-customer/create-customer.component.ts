import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  customer: Customer = new Customer();

  constructor(private router: Router, private customerService: CustomerService) { }

  ngOnInit() {
  }

  createCustomer(): void {
      this.customerService.createCustomer(this.customer)
          .subscribe( data => {
            alert("Customer created Ok");
          });

    };

}
