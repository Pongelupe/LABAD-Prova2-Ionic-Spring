import { HttpClientModule } from '@angular/common/http';
import { ErrorHandler, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { AccountDetailsPage } from '../pages/account-details/account-details';
import { CustomerDetailsPage } from '../pages/customer-details/customer-details';
import { HomePage } from '../pages/home/home';
import { TabsPage } from '../pages/tabs/tabs';
import { CustomerProvider } from '../providers/customer/customer';
import { MyApp } from './app.component';



@NgModule({
  declarations: [
    MyApp,
    HomePage,
    TabsPage,
    CustomerDetailsPage,
    AccountDetailsPage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    HttpClientModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    CustomerDetailsPage,
    TabsPage,
    AccountDetailsPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    { provide: ErrorHandler, useClass: IonicErrorHandler },
    CustomerProvider
  ]
})
export class AppModule { }
