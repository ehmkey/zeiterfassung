import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';


import { AppComponent } from './app.component';
import { AppNavbarComponent } from './app-navbar/app-navbar.component';
import { AppRoutingModule } from './/app-routing.module';
import { CustomerComponent } from './customer/customer.component';
import { EmployeeComponent } from './employee/employee.component';
import { TimetrackerComponent } from './timetracker/timetracker.component';

import { MatInputModule, MatButtonModule, MatSelectModule, MatIconModule, MatFormFieldModule,
  MatDatepickerModule, MatNativeDateModule, DateAdapter, MAT_DATE_LOCALE,
  MatCardModule} from '@angular/material';
import {MatTabsModule} from '@angular/material/tabs';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AdministratorComponent } from './administrator/administrator.component';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatTableDataSource, MatTableModule} from '@angular/material';
import {MatPaginatorModule} from '@angular/material/paginator';



import { ReactiveFormsModule } from '@angular/forms';
import { OrderComponent } from './order/order.component';  // <-- #1 import module


@NgModule({
  declarations: [
    AppComponent,
    AppNavbarComponent,
    CustomerComponent,
    EmployeeComponent,
    TimetrackerComponent,
    AdministratorComponent,
    OrderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    NgbModule.forRoot(),
    AppRoutingModule,
    MatInputModule,
    MatButtonModule,
    MatSelectModule,
    MatIconModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatTabsModule,
    MatAutocompleteModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MatCardModule,
    MatGridListModule,
    MatTableModule,
    MatPaginatorModule
  ],
  providers: [{provide: MAT_DATE_LOCALE, useValue: 'de-DE'}],
  bootstrap: [AppComponent]
})
export class AppModule { }
