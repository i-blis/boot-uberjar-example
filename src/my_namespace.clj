(ns my-namespace
  (:require [boot.cli :refer [defclifn]])
  (:gen-class))                         

(defclifn -main
  [a a-option VAL  kw    "The option."
   c counter       int   "The counter."
   e entry    VAL  sym   "An entrypoint symbol."
   f flag          bool  "Enable flag."
   o o-option VAL  str   "The other option."]                    
  (println (apply str *opts*)))
