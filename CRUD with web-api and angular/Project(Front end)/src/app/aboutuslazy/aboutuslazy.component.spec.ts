import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutuslazyComponent } from './aboutuslazy.component';

describe('AboutuslazyComponent', () => {
  let component: AboutuslazyComponent;
  let fixture: ComponentFixture<AboutuslazyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AboutuslazyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AboutuslazyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
