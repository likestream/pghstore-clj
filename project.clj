(defproject pghstore-clj "0.1.2"
  :description "Helper functions for working with PostgresSQL hstore data type in Clojure via JDBC"
  :url "http://github.com/blakesmith/pghstore-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                  [prismatic/plumbing "0.0.1"]]
  :dev-dependencies [[postgresql "9.2-1002.jdbc4"]])
