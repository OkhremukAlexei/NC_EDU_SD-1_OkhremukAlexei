import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Info} from './Info';

@Injectable()
export class HttpService{
    constructor(private http: HttpClient){ }
    postData(info: Info)
    {
        const head = new HttpHeaders().set('Authorization', 'auth-token');
        const body = {login: info.login, password: info.password};
        return this.http.post('http://localhost:8080', body, {headers: head});
    }
}