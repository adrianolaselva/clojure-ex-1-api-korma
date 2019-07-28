(ns ex-clojure-api-1.database
  (:use korma.db))

(defdb db (mysql
            { :classname "com.mysql.jdbc.Driver"
             :subprotocol "mysql"
             :subname "//localhost/menagerie"
             :user "laravel"
             :password "123@mudar"}))

