import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoArgentinaProgramaComponent } from './logo-argentina-programa.component';

describe('LogoArgentinaProgramaComponent', () => {
  let component: LogoArgentinaProgramaComponent;
  let fixture: ComponentFixture<LogoArgentinaProgramaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LogoArgentinaProgramaComponent]
    });
    fixture = TestBed.createComponent(LogoArgentinaProgramaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
