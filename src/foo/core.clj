(ns foo.core)

(defn factorial [n]
  (if (zero? n)
    1
    (* n (factorial (dec n)))))
