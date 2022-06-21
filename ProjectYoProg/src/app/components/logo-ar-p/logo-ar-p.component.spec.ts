import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoArPComponent } from './logo-ar-p.component';

describe('LogoArPComponent', () => {
  let component: LogoArPComponent;
  let fixture: ComponentFixture<LogoArPComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoArPComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoArPComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
