import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SocNetComponent } from './soc-net.component';

describe('SocNetComponent', () => {
  let component: SocNetComponent;
  let fixture: ComponentFixture<SocNetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SocNetComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SocNetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
