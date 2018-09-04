import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Customer } from './customer';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }

  private apiBaseUrl = '/api/customers';

  public getCustomers() {
    return this.http.get<Customer[]>(this.apiBaseUrl+'/all');
  }

  public createCustomer(customer) {
    return this.http.post<Customer>(this.apiBaseUrl+'/create', customer);
  }

  public deleteCustomer(customer) {
    return this.http.delete(this.apiBaseUrl + "/delete/"+ customer.id);
  }

}
