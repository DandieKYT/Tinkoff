<h1>Добро пожаловать!</br> 

# <a name="TableOfContents">Содержание страницы</a>
+ [:trophy: Мои инструменты и технологии](#MyToolsAndTechnologies)
+ [✍Описаниe](#Description)
+ [:heavy_check_mark:  Реализованные проверки:](#ImplementedСhecks)
+ [🎯Проект](#Project)
+ [👷‍♂️ Сборка в Jenkins](#Build_in_Jenkins)
+ [🖥 Запуск из терминала](#terminal)
+ [:chart_with_downwards_trend: Allure отчет](#Allure_report)
    + [Главный экран отчета](#Allure_report1)
    + [Страница с проведенными тестами](#Allure_report2)
+ [:bar_chart: Интеграция с Allure TestOps](#Integration_Allure_TestOps)
    + [Страница с тестами в TestOps](#ManualTest)
+ [:iphone: Отчет в Telegram](#Telegram)
+ [:movie_camera: Видео примеры прохождения тестов](#Video)

<a name="MyToolsAndTechnologies"><h2>:trophy: Мои инструменты и технологии</h2></a>
<p  align="center">

<code><a href = "https://www.java.com/ru/">![This is an image](/design/icons/Java.png)</a></code>
<code><a href = "https://gradle.org/">![This is an image](/design/icons/gradle.png)</a></code>
<code><a href = "https://www.jetbrains.com/ru-ru/idea/">![This is an image](/design/icons/Intelij_IDEA.png)</a></code>
<code><a href = "https://ru.selenide.org/">![This is an image](/design/icons/Selenide.png)</a></code>
<code><a href = "https://selenoid.autotests.cloud/#/">![This is an image](/design/icons/Selenoid.png)</a></code>
<code><a href = "https://junit.org/junit5/">![This is an image](/design/icons/JUnit5.png)</a></code>
<code><a href = "https://www.jenkins.io/">![This is an image](/design/icons/Jenkins.png)</a></code>
<code><a href = "https://github.com/allure-framework">![This is an image](/design/icons/Allure_Report.png)</a></code>
<code><a href = "https://qameta.io/">![This is an image](/design/icons/AllureTestOps.png)</a></code>
<code><a href = "https://web.telegram.org/k/">![This is an image](/design/icons/Telegram.png)</a></code>
<code><a href = "https://www.atlassian.com/ru/software/jira">![This is an image](/design/icons/Jira.png)</a></code>
<code><a href = "https://www.postman.com/">![This is an image](/design/icons/postman.png)</a></code>
<code><a href = "https://git-scm.com/">![This is an image](/design/icons/git.png)</a></code>
<code><a href = "https://github.com/">![This is an image](/design/icons/GitHub.png)</a></code>
<code><a href = "https://developer.chrome.com/docs/devtools/">![This is an image](/design/icons/devtools.png)</a></code>
</br>

<a name="Description"><h2>Описаниe</h2></a>
Автотесты в этом проекте написаны на `Java` с использованием `Selenide`.\
`Gradle` - для автоматической системы сборки.  \
`JUnit5` - для модульного тестирования.\
`Jenkins` - CI/CD для удаленного запуска тестов.\
`Selenoid` - для удаленного запуска браузеров в `Docker` контейнере.\
`Allure Report` - для визуализации результатов тестирования.\
`Telegram Bot` - для уведомлений о результатах тестирования.\
`Allure TestOps` - система управления тестированием.

<a name="ImplementedСhecks"><h2>:heavy_check_mark:  Реализованные проверки:</h2></a>

:clipboard: Наличие вакансии тестировщика на <a href = "https://www.tinkoff.ru/career/it/?specialtyUrl=testirovanie">странице компании </br>

:speech_balloon: Переход на официальную страницу компании в <a href = "https://vk.com/tinkoffbank">ВК
<a href = "https://t.me/tinkoffbank">/Telegram</a>


:clipboard: 
Открытие страницы Вклады и проверка работы <a href = "https://www.tinkoff.ru/deposit/?internal_source=home_icon"> калькулятора.</a>
</br>

🔎 
Проверка страницы <a href = "https://www.tinkoff.ru/login/"> авторизации.
</br>

:card_index_dividers: Проверка <a href = "https://www.tinkoff.ru/business/reports/">условий передачи информации.<a/>
</br>

 <a name="Project"><h2>Проект</h2></a>

 <code><a href="https://www.tinkoff.ru/"><img src="/design/icons/biem.jpg" width="60"></a></code>Проект по автоматизации тестирования для <a target="_blank" href="https://www.tinkoff.ru/">Tinkoff</a>   российский коммерческий банк, сфокусированный полностью на дистанционном обслуживании, не имеющий розничных отделений.
 :star2:

<a name="Build_in_Jenkins" href="https://jenkins.autotests.cloud/job/TinkoffTest/"><h2>👷‍♂️ Сборки в [Jenkins](https://jenkins.autotests.cloud/job/TinkoffTest/)<h2></a>

![image](https://github.com/DandieKYT/Tinkoff/assets/75677738/1904d051-1d2b-43f3-b0c3-76f3c7d39a92)



<a name="terminal"><h2>:computer: Запуск из терминала</h2></a>
Удаленный запуск:

```

clean test

```
<a name="Allure_report"><h2>:chart_with_downwards_trend: Allure </a><a href="https://jenkins.autotests.cloud/job/TinkoffTest/4/allure/">отчет</a></h2>

- <a name="Allure_report1"><h3>Главный экран отчета</h3></a>

![image](https://github.com/DandieKYT/Tinkoff/assets/75677738/3ec0e1fc-5672-402e-b399-bd23848892ae)



-  <a name="Allure_report2"><h3>Страница с проведенными тестами</h3></a>

![image](https://github.com/DandieKYT/Tinkoff/assets/75677738/dffb8315-97ea-40d7-b993-893a97465cd4)



<a name="Integration_Allure_TestOps"><h2>:bar_chart: Интеграция с Allure TestOps</h2></a>




<a name="Telegram"><h2>:iphone: Отчет в Telegram</h2></a>

![image](https://github.com/DandieKYT/Tinkoff/assets/75677738/a89c1c1f-9472-4e0f-9459-2b499c0263a5)



<a name="Video"><h2>:movie_camera: Видео примеры прохождения тестов</h2></a>

- <a name="Video1"><h3>Пример запуска тестов через selenoid</h3></a>
    <h1><a href="https://selenoid.autotests.cloud/video/1a0320049502144d9421ba731289a673.mp4">TinkoffTest<br>





https://github.com/DandieKYT/Tinkoff/assets/75677738/5973d329-8329-4ee9-b14e-311456f6bf01





