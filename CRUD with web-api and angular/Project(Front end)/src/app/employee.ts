import { Iemployee } from "./iemployee";

export class Employee implements Iemployee{
    
    constructor(public code: number, public name: string, public gender: string,
        public annualSalary: number, public dateOfBirth: string) {
    }
   
}
