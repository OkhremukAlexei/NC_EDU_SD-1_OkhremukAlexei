import { Component } from '@angular/core';
import { HttpService} from './http.service';
import { Info } from './Info';
@Component({
    selector: 'authorization-app',
    template: `<div class="container">
        <div class="container">
            <div class="row centered">
                <div id="login" class="col-lg-6 col-lg-offset-3">
                    <h3>Log-In</h3>
                    <form method="get">
                        <div class="form-group">
                            <input id="input-login" [(ngModel)]="info.login" class="form-control" aria-describedby="login" placeholder="Enter login" name="login-input"   required="required">
                        </div>
                        <div class="form-group">
                            <input id="input-password" type="password" [(ngModel)]="info.password" class="form-control" placeholder="Password" name="password-input" required="required">
                        </div>
                        <div class="form-group form-check">
                            <input type="checkbox" class="form-check-input" id="remember" [(ngModel)]="info.remember" name="check-remember">
                            <label class="form-check-label" for="remember">Remember me</label>
                        </div>
                        <button class="btn btn-block btn-danger" (click)="setInfo(info)">Submit</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div *ngIf="done">
        <div>Login: {{receivedInfo.login}}</div>
        <div>Password: {{receivedInfo.password}}</div>
    </div>`,
    providers: [HttpService]
})
export class AppComponent {
    info: Info = new Info();
    receivedInfo: Info;
    done: boolean = false;
    constructor(private httpService: HttpService){}
    setInfo(info: Info) {
        this.httpService.postData(info)
            .subscribe(
                (data: Info) => {this.receivedInfo = data; this.done = true;},
                error => console.log(error)
            );
    }
}