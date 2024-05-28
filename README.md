# spring-api-secure-jwt-token
securisation d'api spring ,  athentification et authorization avec les token jwt


## Description 
Ceux-ci est une api backend qui gere l'autorisation et l'authentification des utilisateurs avec  des jwt-token

## Enpoints 
        - /[Get] : pour tester si le projet  fonctionne bien. Elle est ouverte a tous

        -/auth/login/[post] : pour s'authentifier avec son email et son mot de passe et obtenir un token jwt (valable pendant 1 minute ). elle est ouvete a tous

![Screenshot from 2024-05-28 23-10-05](https://github.com/florentJava/spring-api-secure-jwt-token/assets/130192163/e1eed9b5-b01b-4e98-965b-50ace19c6d48)

        -/secured[Get] : Renvoie un message qui confirme l'authentification. necessite la presence d'un token jwt dans son en-tete 

![Screenshot from 2024-05-28 23-10-24](https://github.com/florentJava/spring-api-secure-jwt-token/assets/130192163/46608332-7ac1-4cb6-9f23-89be1229e8f6)



## NB : 
        - Language : java-spring
        - Base de donnees des utilisateurs  : /demo/src/main/ressources/data.sql
