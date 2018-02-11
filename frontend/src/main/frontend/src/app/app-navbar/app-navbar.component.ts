import { Component, OnInit } from '@angular/core';
import {MatTabsModule} from '@angular/material/tabs';

@Component({
  selector: 'app-navbar',
  templateUrl: './app-navbar.component.html',
  styleUrls: []
})
export class AppNavbarComponent implements OnInit {

  navLinks = [
    {label: 'Zeiterfassung', path: '/timetracker'},
    {label: 'Administrator', path: '/administrator'}
  ];
  constructor() { }

  ngOnInit() {
  }

}
