(ns hello
  (:require ["bun:sqlite$default" :as sqlite]))

(let [db (new sqlite ":memory:")]
  (prn (.get (.query db "select 'Bun' as runtime"))))