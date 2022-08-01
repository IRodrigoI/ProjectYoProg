import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logo-ar-p',
  templateUrl: './logo-ar-p.component.html',
  styleUrls: ['./logo-ar-p.component.css']
})
export class LogoArPComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  login(){
    this.router.navigate(['/login']);
  }
}
