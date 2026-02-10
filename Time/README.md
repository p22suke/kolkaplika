
### Siina's Thoughts On Time
*Original thoughts can be found at github.com:p22suke/tekstid; diary/Tue10Feb...*

*Variant A — manifest / isiklik-poliitiline**
Sobib, kui see projekt peab tunnistama, miks ta olemas on.
### I didn’t start thinking about time because I wanted a better calendar.I started because I broke down when I realized how deeply invisible conventions run my body, my work, my sense of urgency. I lived for a while in a 13-month calendar. Nothing mystical changed — except that it became livable. This project begins at the moment I needed to write code just to survive the thought. Not to optimize time, but to translate between fictions without pretending one of them is natural.

*Variant B — tehniline, aga filosoofia on sees*
Sobib, kui tahad, et kood oleks esmane keel, mitte teraapia.
### ThoughtsOnTime is a set of tools and notes for translating between calendar systems. Gregorian time is treated here not as default truth, but as one convention among others. The project emerged from practical need: to build working conversion models between calendars that are internally consistent, human-usable, and explicit about their assumptions. Any psychological fallout is considered a side effect of touching infrastructure that usually remains unquestioned.

*Variant C — hübriid (minu lemmik sinu jutu põhjal)*
See hoiab närvi ja insenerimõtlemist.
### I reached coding again through a calendar. Living briefly inside a 13-month system made something obvious and unbearable: time works because we don’t look at it too closely. ThoughtsOnCalendar started as an acute need to write a few lines of code — just enough to make translations between systems possible. Gregorian → other. Other → Gregorian. Fiction → fiction. What followed was a breakdown, a relocation impulse, and a decision to rebuild my practice around code rather than art. This project does not aim to replace time. It aims to make its conventions visible, explicit, and therefore negotiable.

[] We know the calendar is conceptually broken.
[] We also already have a design that works enough to start coding.
[] We want to build now, in Java, for yourself.
[] While building, we want to:
[] refine the design
[] talk through structure & architecture
[] sanity-check assumptions
[] not be rushed or judged for looping questions

## Track 1 — Buildable Core (start immediately)
this is the
```bash
code ?????? 
```
and write code RIGHT NOW track.

[] ????? = ?

**Goal: a minimal, working calendar engine.**

Questions we answer here:
* What is a CalendarSystem in code?
* What is a Date without assuming Gregorian?
* How do we represent:
* months?
* month lengths?
* leap rules?
* What does “conversion” actually mean in data terms?

We accept that this version may be conceptually imperfect. That’s fine. Code is a thinking tool.

## Track 2 — Conceptual Repair (iterative, slow)
This is where you already know what’s broken, but don’t yet know how to fix it cleanly.

Questions here:
* Where does the Gregorian calendar smuggle in assumptions?
* What did the 13-month system fix for you?
* What hurt or felt artificial even there?
* What must be explicit instead of “obvious”?

This track feeds back into Track 1 when you’re ready.

### Concrete next step (no abstractions yet)
Let’s do one very grounded thing first.
Answer this in your own words (bullet points are perfect):

1. In your working design, what are the primitives?

For example (don’t copy, just react):
[] year = ?
[] month = ?
[] day = ?
[] is “month” required?
[] is “week” real or derived?
[]  does a date exist without a calendar?

Just list what exists in your head right now.

2. What broke conceptually? (one sentence each)
No essays. Just pressure points:
[] “The calendar is broken because ___”
[] “The Gregorian assumption I can’t tolerate anymore is ___”

3. One constraint
Finish this sentence:
[] “If I don’t build this in Java, I will be annoyed because ___.”
This tells me how strict / clean / experimental the architecture should be.

Once you answer those, I can:
? sketch a Java package structure
? propose interfaces vs concrete classes
? help you decide what to freeze and what to keep fluid
" and walk with you line-by-line if you want