OutlineParser
=============

A recursive descent parser to parse an outline numbering grammar.

```
Outline	numbering	follows	a	certain	“grammatical”	pattern.
I.	Roman	numerals	at	highest	level
  A.	Capital	letters	at	next	level
    1.	Arabic	numbers	at next	level
      a.	Lowercase	letters	at	next	level
      
Thus, we can take an outline section reference such as II.B.2.b and verify if it follows the grammatical structure (it does). However, the following references do not: IIB2b (no dots), B.2.II.b (wrong order), B.2.a (missing leading section). Note that II.B is considered legal, that is trailing sections can be omitted.

Write the grammar productions needed to recognize/generate an outline section reference such as the ones above. You can limit your choices at each level to 4 (i.e., I,II,III,IV,A,B,C,D, etc.).
```

# Problem 1
*Write the grammar, G1, in the most obvious, straightforward way.*  

```
G = (T, N, P, S) where  
T = {I, II, III, IV, A, B, C, D, 1, 2, 3, 4, a, b, c, d, .},  
N = {<Outline>, <RomanNumeral>, <CapitalLetter>, <ArabicNumeral>, <LowercaseLetter>},  
P = {  
  <Outline> ::= <RomanNumeral>  
  <Outline> ::= <RomanNumeral>.<CapitalLetter>  
  <Outline> ::= <RomanNumeral>.<CapitalLetter>.<ArabicNumeral>  
  <Outline> ::= <RomanNumeral>.<CapitalLetter>.<ArabicNumeral>.<LowercaseLetter>  
  <RomanNumeral> ::= I | II | III | IV  
  <CapitalLetter> ::= A | B | C | D  
  <ArabicNumeral> ::= 1 | 2 | 3 | 4  
  <LowercaseLetter> := a | b | c | d  
},  
S = <Outline>
```

# Problem 2
*Write grammar G2 that repairs any ambiguity problems.  (If no ambiguity problems, just say G2 = G1.)*  

**G2 = G1**

# Problem 3
*Write the grammar G3 that repairs any left-recursion problems.  (If none, say G3 = G2.)*  

**G3 = G2**

# Problem 4
*Write the grammar G4 that repairs any left-prefix problems. (If none, say G4 = G3.)*  

**G4 = G3**
