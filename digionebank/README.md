# Repositório do módulo Orientaçãao a Objetos com kotlin


## Comandos utilizados para criação do project via cmd

- mvn archetype:generate -DarchetypeGroupId=org.jetbrains.kotlin /
-DarchetypeArtifactId=kotlin-archetype-jvm -Dversion=1.6.21

### Referência:
- https://javalibs.com/archetype/org.jetbrains.kotlin/kotlin-archetype-jvm

## Comandos para compilação do project e execução

- mvn clean package
- java -jar digionebank-1.6.21-jar-with-dependencies.jar


# Para execução foi necessário adicionar no pom.xml o plugin para criação \
arquivo jar assim como apontar a classe de entrada da função principal.
