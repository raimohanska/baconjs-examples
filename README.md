baconjs-examples
================

Bacon.js AJAX example, consisting of a Clojure/Compojure fake search server and a web page.

The idea is to demonstrate how Functional Reactive Programming and Bacon.js can make your AJAX apps more elegant and reliable. 
The example code is 100% free of mutable state. I'll try to explain the details later, maybe here.

Please check out

- [Live version](http://baconjs-examples.herokuapp.com) running on Heroku
- [Source code](https://github.com/raimohanska/baconjs-examples/blob/master/resources/public/index.html) for the page, with some comments

To run this on your machine you need something like

- Install Clojure and Lein
- `lein deps`
- `lein ring server`
