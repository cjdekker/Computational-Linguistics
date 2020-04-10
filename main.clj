(defn abs [x] (Math/sqrt (* x x)))

(defn take-square [x] (* x x))
;problem is lack of parameters
(defn sum-of-squares [x y]
(+ (take-square x) (take-square y)))
;problem is parameters had functions in them

(def exp-13-1 13)
(def exp-13-2 (Math/sqrt 169))
(def exp-13-3 (- 15 2))
(def exp-13-4 (* 1 13))

(defn third [l] (first(rest(rest l))))

(defn compose [f g] (fn [x] (f(g x))))

(defn first-two [l] (list (first l) (first(rest l))))

(defn remove-second [l] (concat (list (first l)) (rest(rest l))))

(defn add-to-end [l x] (concat l (list x)))

(def reverse (fn [l]
              (if (empty? l)
                '()
                (concat (reverse (rest l)) (list(first l))
                      ))))

(def count-to-1 (fn [n]
              (if (< n 2)
                (list 1)
                (cons n (count-to-1 (- n 1))
                      ))))

(defn count-to-n [n]
  ((compose reverse count-to-1) n))

(defn get-max [l]
              (if (= (count l) 1)
                (first l)
                (if (> (first l) (get-max (rest l)))
                  (first l)
                  (get-max (rest l)))))


(defn greater-than-five? [l] 
        (map (fn [x] (if (> x 5) 'true' 'false' )) l))

(defn concat-three [x y z]
  (concat x (concat y z)))
