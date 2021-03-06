import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  employee: Employee = new Employee()
  constructor(private employeeService: EmployeeService, private router: Router) {
   }

  ngOnInit(): void {
  }
  onClick(){
    console.log(this.employee)
    this.saveChanges();
  }
  saveChanges(){
    this.employeeService.addEmployee(this.employee).subscribe(data => {console.log(data);
      this.goToEmployeeList();
    },
    error => console.error(error));
  }
  goToEmployeeList(){
    this.router.navigate(['/employees'])
  }

}
