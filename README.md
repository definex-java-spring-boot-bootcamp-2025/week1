# Hafta 1

## İçerik

- Java Temelleri
- Object Oriented Programming Concepts with Java
- Clean Code yaklaşımı
- Maven ile bağımlılık yönetimi

## Araştırma için Keyword'lerimiz

- Java Temelleri
  - If-Else
  - Switch Case
  - Loop
  - Design Patterns
  - Immutability
  - Pass by Value
  - Pass by Reference
  - Garbage Collection
  - Memory Management
- Object Oriented Programming Concepts with Java 
  - Encapsulation
  - Polymorphism 
  - Inheritance
  - Abstraction
  - Overriding
  - Overloading
- Clean Code 
  - Naming and Method Responsibility o Default Values
  - Exception Handling
  - Boolean Comparisons
  - Method Parameters
  - Loop and Collection Processing
- Maven ile Bağımlılık Yönetimi
  - Lifecycles
  - Archtype Management
  - Dependency Management 
  - Plugins

## Pass by Value

> Çok önemli bir konu olduğu için burada da ek bilgi olarak koymak istedim. Çünkü halen mülakatlarda bu soruyu ben cevaplıyorum.

Pass By Value Yöntemini davranışını etkileyen önemli faktörler:
- Değişken tipinin primitive(ilkel) tipinde olması
- Değişken tipinin reference(referans) tipinde olması
- Değişken tipinin immutable olması.

Pass by Value davranışının etkilenmesinin sebebi:
- Primitive tiplerde pointer mantigi yoktur ve stack'de tutulur. Pass by value yapilirken yep yeni bir değişken-veri ikilisi oluşur.
- Reference tiplerde değişken ve pointer stack'de, veri ise heap'de tutulur. Pass by value yapilirken pointer kopyalanır yani sadece yep yeni bir değişken oluşur ama point ettiği veri aynıdır.
- Immutable Reference tiplerinde bir değişiklik yapıldığında heap'de yep yeni bir veri oluşur ve değişken yeni oluşan veriye point eder.

Bu [video'da](https://www.youtube.com/watch?v=LTnp79Ke8FI) konu detaylı anlatılmaktadır.

