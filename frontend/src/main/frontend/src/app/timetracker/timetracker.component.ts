import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms';

import {Observable} from 'rxjs/Observable';
import {startWith} from 'rxjs/operators/startWith';
import {map} from 'rxjs/operators/map';


import { MatInputModule, MatButtonModule, MatSelectModule, MatIconModule,
   MatFormFieldModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatAutocompleteModule} from '@angular/material/autocomplete';

export class Employee {
  constructor(public firstname: string, public lastname: string) { }
}
@Component({
  selector: 'app-timetracker',
  templateUrl: './timetracker.component.html',
  styleUrls: ['./timetracker.component.css']
})
export class TimetrackerComponent {
  employeeCtrl: FormControl;
  filteredEmployees: Observable<any[]>;

  employees: Employee[] = [
    {
      firstname: 'Markus',
      lastname: 'Kienleitner',
    },
    {
      firstname: 'Leonie',
      lastname: 'Kienleitner',
    },
    {
      firstname: 'Laurens',
      lastname: 'Kienleitner',
    },
    {
      firstname: 'Test',
      lastname: 'User',
    },
  ];

  constructor() {
    this.employeeCtrl = new FormControl();
    this.filteredEmployees = this.employeeCtrl.valueChanges
      .pipe(
        startWith(''),
        map(state => state ? this.filterEmployees(state) : this.employees.slice())
      );
  }

  filterEmployees(name: string) {
    return this.employees.filter(employee =>
      employee.lastname.toLowerCase().indexOf(name.toLowerCase()) === 0);
  }
}
