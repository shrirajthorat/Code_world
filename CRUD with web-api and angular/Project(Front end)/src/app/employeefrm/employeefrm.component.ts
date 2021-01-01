import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Iemployee } from '../iemployee';

@Component({
  selector: 'app-employeefrm',
  templateUrl: './employeefrm.component.html',
  styleUrls: ['./employeefrm.component.css']
})
export class EmployeefrmComponent implements OnInit {

  employee: Iemployee;
  submitted = false;
  mymessage:any;
  Gender: Array<string> = ['Male', 'Female'];
  constructor(private _employeeService: EmployeeService,
    private _activatedRoute: ActivatedRoute, private router: Router) { }


  ngOnInit(): void {
    let empCode: string = this._activatedRoute.snapshot.params['code'];
    let acode: number = parseInt(empCode);
    this._employeeService.getEmployeeByCode(acode).subscribe(data => this.employee = data);
  }

  update(frm: NgForm) {
    this.submitted = true;
    if (frm.invalid) {
      return;
    }
    else {
      this.gotoserver(this.employee)
    }
  }
  gotoserver(objemp) {
    /* this._employeeService.updateemp(objemp).subscribe(data=>
      {
        console.log(data);
        this.router.navigate(['/home']);
      }
        );*/
        this._employeeService.updateemp(objemp).subscribe(
                      (m)=>this.mymessage=m,
                      (err)=>this.mymessage=err 
                      );
          
  }
}


