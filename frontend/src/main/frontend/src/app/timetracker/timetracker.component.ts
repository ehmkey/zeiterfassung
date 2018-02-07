import { Component, OnInit } from '@angular/core';

import { MatInputModule, MatButtonModule, MatSelectModule, MatIconModule,
   MatFormFieldModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDatepickerModule} from '@angular/material/datepicker';



@Component({
  selector: 'app-timetracker',
  templateUrl: './timetracker.component.html',
  styleUrls: ['./timetracker.component.css']
})
export class TimetrackerComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
