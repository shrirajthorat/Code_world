import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Iemployee } from '../iemployee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employee:Iemployee;
  constructor(private _employeeservice:EmployeeService,
    private _activatedRoute:ActivatedRoute,private router:Router) { }

  ngOnInit(): void {
    let empcode:string=this._activatedRoute.snapshot.params['code'];
    let acode:number=parseInt(empcode);
    this._employeeservice.getEmployeeByCode(acode).subscribe(  data=>this.employee=data );
  }

  goback()
  {
    this.router.navigate(['/employees']);
  }

}
