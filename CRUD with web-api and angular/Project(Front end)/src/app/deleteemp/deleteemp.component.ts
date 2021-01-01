import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Iemployee } from '../iemployee';

@Component({
  selector: 'app-deleteemp',
  templateUrl: './deleteemp.component.html',
  styleUrls: ['./deleteemp.component.css']
})
export class DeleteempComponent implements OnInit {

  employee:Iemployee;
  constructor(private _employeeService: EmployeeService,
    private _activatedRoute: ActivatedRoute,private router:Router) { }

  ngOnInit(): void {

    let empCode: string = this._activatedRoute.snapshot.params['code'];
       let acode:number= parseInt(empCode);
        this._employeeService.getEmployeeByCode(acode).subscribe(  data=>this.employee=data );       
  }

  deletedata()
  {
    this._employeeService.deletedata(this.employee.code).subscribe(data=>
      {
        console.log(data);
        this.router.navigate(['/home']);
      });
  }

}
