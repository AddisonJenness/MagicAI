

(import Util.*)

;; DEFTEMPLATES
(deftemplate creature (slot name) (slot power) (slot toughness) (slot attacking) (slot victorious))

(deftemplate player (slot name) (slot lifetotal) (slot wins))

;;
 DEFRULES
(defrule initialBlocks 
"if not victorious then blocking"

=>

)

(defrule wouldDie 
"if enemy power >= your life"


=>

)

(defrule wouldKill 
"if my total power - my highest per enemy blocker "

=>

)

(defrule reconsiderBlocks 
"if wouldDie add smallest creature to blocker"
(wouldDie && !wouldKill)
=>
(bind ?i (lowestpower-get p1))
)



;;

DEFFUNCTIONS


(deffunction power-get (?player ?creature)
 (return (call BoardState getPower ?player ?creature))
)


(deffunction wins-get (?player)
	(return (call BoardState getLifeTotal ?player))
)


(deffunction life-get (?player)
	(return (call ?board getLifeTotal ?player))
)


(deffunction numberofcreatures-get (?player)
	(return (call BoardState getNumberOfCreatures ?player))
)


(deffunction playerpower-get (?player)
	(return (call BoardState getPlayerPower ?player))
)


(deffunction playerpower-set (?player, ?creature)
	(call BoardState setPlayerPower ?player ?creature)
)


(deffunction lowestpower-get (?player) 
	(return (call BoardState getLowestPower ?player))
)


(deffunction highestpower-get (?player) 
	(return (call BoardState getHighestPower ?player))
)


(deffunction blockstatus-set (?player ?creature)
	(call BoardState setBlockerStatus ?player ?creature)
)


(deffunction attackerstatus-set (?player ?creature)
	(call BoardState setAttackerStatus ?player ?creature)
)


(deffunction playerwins-get (?player)
	(return (call BoardState getPlayerWins ?player))
)



Assertions

(bind ?player (integer 1))
(bind ?board (new BoardState))
(bind ?p1hp (life-get 1)) 

(bind ?p2hp (life-get 2))


(deffacts Initialize

(player (name p1) (life ?p1hp))
()
)


;; 