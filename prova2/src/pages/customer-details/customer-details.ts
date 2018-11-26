import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { Customer } from '../../model/Customer';
import { AccountDetailsPage } from '../account-details/account-details';

/**
 * Generated class for the CustomerDetailsPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@Component({
  selector: 'page-customer-details',
  templateUrl: 'customer-details.html',
})
export class CustomerDetailsPage {

  customer: Customer;

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.customer = this.navParams.get('customer');
  }

  accountSelected(event, account) {
    this.navCtrl.push(AccountDetailsPage, { account });
  }

}
