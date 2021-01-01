import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable,throwError } from 'rxjs';
import { Iemployee } from './iemployee';
import { Employee } from './employee';
import { catchError, tap  } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  url="http://localhost:51685/api/";

  constructor(private http: HttpClient) { }

  getEmployee():Observable<Iemployee[]>
  {
    return this.http.get<Iemployee[]>(this.url+"Employee")
  }
  getEmployeeByCode(code:number):Observable<Iemployee>
  {
    return this.http.get<Iemployee>(this.url+"Employee/"+code);
  }
  deletedata(code):Observable<Iemployee>
  {
      return this.http.delete<Employee>(this.url+"Employee/"+code);
  }
  updateemp(empobj:Employee):Observable<any>
  {
      return this.http.put<Number>(this.url+"Employee/"+empobj.code,empobj).pipe
              (
      tap(_ => console.log(`updated emp id=${empobj.code}`)),
      catchError(this.handleError) );    
  }
  postcustomer(empobj:Employee):Observable<any>
  {
    return this.http.post<any>(this.url+"Employee/",empobj);
  }


  private handleError(errorResponse: HttpErrorResponse) {
            if (errorResponse.error instanceof ErrorEvent) {
                console.error('Client Side Error :', errorResponse.error.message);
            } else {
                console.error('Server Side Error :', errorResponse);
            }
            // return an observable with a meaningful error message to the end user
            return  throwError(errorResponse.message);
        }
    

}
