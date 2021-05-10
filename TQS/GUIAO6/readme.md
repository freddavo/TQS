

Ex1
  
  c) Utilizei mvn clean verify sonar:sonar -Dsonar.login=myAuthenticationToken no diretório do projeto para adicionar a análise do projeto ao dashboard do sonarqube
     Foram identificados 1 Bug, 1 security hotspot e 25 code smells.

  e)
     A análise passou o quality gate Sonar way default(quality gate definida) com as seguintes condições:
		1-bug
		0-vulnerabilidades
		1-security hotspot
		28 code smells
     

  f)
		Bug: Não é correto crirar um obj random sempre que e necessario crirar um numero random. Radom nao deve voltar a ser chamado. Deve-se guardar o random calculado da primeira vez e reutiza-lo.

		Vulnerabilidades: 0

		Securtity Hotspot: Usar geradores pseudo aleatórios está associado a algumas CVE's.

		Code Smell
			-a classe DemoMain é utilizada a função System.out.println para apresentar mensagens; esta devia ser trocada para se utilizar um logger, de forma a ser fácil para o utilizador recuperar/ter acesso aos logs e permitir que esta esteja num formato uniformizado, entre outros. Este code smell foi identificado um total de 7 vezes nesta classe	

			-a função generateRandomDip, o valor i inicializado e usado no ciclo for está a ser alterado no "corpo" deste ciclo e não "dentro" da sua definição. 



	
	 		-									-
	
	

Ex2

  a) technical debt-2h, o que quer dizer que é  necessário um programador trabalhar 2 horas para resolver todos os problemas encontrados.

  d) 134, o numero de linhas de código que não estão a ser testadas por unit tests.			

Ex3
Usei um trabalho que realizei o ano passado para a cadeira de IES. O resultado foi:
	60 bugs, 
	20 vulnerabilidades, 
	1 security hotspots, 
	6640 code smells 
