import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Iemployee } from '../iemployee';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

  employees:Iemployee[];
  constructor(private _empservice:EmployeeService) { }

  ngOnInit(): void {
      this._empservice.getEmployee().subscribe(data=>this.employees=data);
  }

}
