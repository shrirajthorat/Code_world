import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeefrmComponent } from './employeefrm.component';

describe('EmployeefrmComponent', () => {
  let component: EmployeefrmComponent;
  let fixture: ComponentFixture<EmployeefrmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeefrmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeefrmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
