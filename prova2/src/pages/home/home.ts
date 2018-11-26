import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { CustomerProvider } from '../../providers/customer/customer';
import { Customer } from '../../model/Customer';
import { Observable } from 'rxjs/Observable';
import { CustomerDetailsPage } from '../customer-details/customer-details';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  customers$: Observable<Customer[]>;

  constructor(
    public navCtrl: NavController,
    private customerProvider: CustomerProvider) {

  }


  ionViewDidLoad(): void {
    this.customers$ = this.customerProvider.getAllCustomer();
  }

  customerSelected(event, customer) {
    this.navCtrl.push(CustomerDetailsPage, { customer });
  }

}
