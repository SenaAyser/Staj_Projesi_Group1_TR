Feature: Grade level function

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario: Bir Admin olarak sinif seviyesi kategorisindeki Ekle fonksiyonunu kullanabilme.
    Given Left navdaki modullere tiklatiniz
      | Setup        |
      | Parameters   |
      | Grade Levels |

    And Add Grade Level butonuna tıklayınız.

    And Form content bilgilerini giriniz
      | name      | 5.Sinif |
      | shortName | 5snf    |
      | order     | 5       |

    And Form Contentdeki bilgileri seciniz
      | nextGrade   |
      | none        |
      | school      |
      | technoStudy |
    When Save butonuna tıklayınız
    Then Successfully mesaji görülmelidir
