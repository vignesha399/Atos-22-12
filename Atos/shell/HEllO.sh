VAR=10
for i in $VAR
do
	  echo "Looping ... number $i"
done
for runlevel in 0 1 2 3 4 5 6 S
do
  mkdir rc.d
