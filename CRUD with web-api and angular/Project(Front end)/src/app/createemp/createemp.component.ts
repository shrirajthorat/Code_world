import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Iemployee } from '../iemployee';

@Component({
  selector: 'app-createemp',
  templateUrl: './createemp.component.html',
  styleUrls: ['./createemp.component.css']
})
export class CreateempComponent implements OnInit {

  empForm: FormGroup;
  Empobj: Iemployee;
  submitted = false;
  genderarr = ['male', 'female'];

  constructor(public fb: FormBuilder, private dataserv: EmployeeService, private router: Router) { // <--- inject FormBuilder
    this.buildEmpForm();
  }
  ngOnInit(): void {
  }


  buildEmpForm() {

    this.empForm = this.fb.group({
      code: ['', [Validators.required]],
      name: ['', Validators.required],
      gender: ['', Validators.required],
      annualSalary: ['', Validators.required],
      dateOfBirth: ['', Validators.required],
    });
  }

  get code() {
    return this.empForm.get('code'); // notice this
  }
  get name() {
    return this.empForm.get('name');  // and this too
  }
  get gender() {

    return this.empForm.get('gender');
  }
  get annualSalary() {
    return this.empForm.get('annualSalary');

  }
  get dateOfBirth() {
    return this.empForm.get('dateOfBirth');

  }

  onSubmit(empForm: FormGroup) {
    this.submitted = true;
    if (!empForm.valid) {
      console.log(empForm.value);
      return;
    }
    this.mapFormValues(empForm);
    this.postdata(this.Empobj);
  }

  mapFormValues(form: FormGroup) {
    this.Empobj = new Employee (null, '', '', null,'');
    this.Empobj.code = form.controls.code.value;
    this.Empobj.name = form.controls.name.value;
    this.Empobj.gender = form.controls.gender.value;
    this.Empobj.annualSalary = form.controls.annualSalary.value;
    this.Empobj.dateOfBirth = form.controls.dateOfBirth.value;
    
     }

     postdata(Empobj) {
      this.dataserv.postcustomer(Empobj).subscribe((data) => {
        console.log(data );
      
          this.router.navigate(['/home']);
      
     });
     } 
}
