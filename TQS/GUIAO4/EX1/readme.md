
a)Identify a couple of examples on the use of AssertJexpressive methods chaining.






    EmployeeRepositoryTest:
    assertThat( found ).isEqualTo(alex); (line 27)
    assertThat(fromDb).isNull(); (line 33)
    assertThat(fromDb).isNotNull(); (line 42)
    assertThat(fromDb.getEmail()).isEqualTo( emp.getEmail()); (line 43)
    assertThat(fromDb).isNull(); (line 49)
    assertThat(allEmployees).hasSize(3).extracting(Employee::getName).containsOnly(alex.getName(), ron.getName(), bob.getName()); (line 65)

    EmployeeService_UnitTest:
    assertThat(found.getName()).isEqualTo(name); (line 53)\ assertThat(fromDb).isNull(); (line 59)
    assertThat(doesEmployeeExist).isEqualTo(true); (line 67)
    assertThat(doesEmployeeExist).isEqualTo(false); (line 75)\ assertThat(fromDb.getName()).isEqualTo("john"); (line 83)
    assertThat(fromDb).isNull(); (line 92)
    assertThat(allEmployees).hasSize(3).extracting(Employee::getName).contains(alex.getName(), john.getName(), bob.getName()); (line 103)

    EmployeeRestControllerTemplateIT:
    assertThat(found).extracting(Employee::getName).containsOnly("bob"); (line 51)
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK); (line 64)
    assertThat(response.getBody()).extracting(Employee::getName).containsExactly("bob", "alex"); (line 65)

    EmployeeRestControllerIT:\ assertThat(found).extracting(Employee::getName).containsOnly("bob"); (line 51)






b)Identify an example in which you mock the behaviorof the repository (and avoid involvinga database). 



Testing the EmployeeService the EmployeeService_UnitTest.java:
whenValidName_thenEmployeeShouldBeFound()
whenInValidName_thenEmployeeShouldNotBeFound()
whenValidName_thenEmployeeShouldExist()
whenNonExistingName_thenEmployeeShouldNotExist()
whenValidId_thenEmployeeShouldBeFound()
whenInValidId_thenEmployeeShouldNotBeFound()
given3Employees_whengetAll_thenReturn3Records()


c)What is the difference between standard @Mock and @MockBean?






O @MockBean é usado para adicionar objetos ao contexto do Spring. O mock vai substituir qualquer bean existente do mesmo tipo no contexto do aplicativo(Spring). Se nenhum bean do mesmo tipo for definido, um novo será adicionado.





d)What is the role of the file “application-integrationtest.properties”? In which conditions will it be used?



.proerties are used to keep a number of properties in a single file to run the application in a different environment. In this case application-integrationtest.properties is used to configure the connection properties datasource to adapt the integration test to use a real database.
