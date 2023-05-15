import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NuevoUsuario } from 'src/app/model/nuevo-usuario';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-new-usuario',
  templateUrl: './new-usuario.component.html',
  styleUrls: ['./new-usuario.component.css']
})
export class NewUsuarioComponent implements OnInit {
  nombreU:string;
  userNameU:string;
  mailU:string;
  password:string;
  constructor(private authS: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void{
    const educacion = new NuevoUsuario(this.nombreU, this.userNameU,this.mailU,this.password);
    this.authS.nuevo(educacion).subscribe(
      data =>{
        alert("Educacion añadida exitosamente");
        this.router.navigate(['']);
      }, err =>{
        alert("Fallo al añadir educacion");
        this.router.navigate(['']);
      }
    )
  }
}
