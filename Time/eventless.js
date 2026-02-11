// this is a sketch and a concept by Miina

//time is string and thus the calendar does not calculate dates, weeks, months.

let calendar = {
    events: []
  };

// syndmus is ebastabiilne objekt
  let event = {
    when: "millalgi veebruaris",
    title: "midagi tähtsat",
    duration: "umbes tund",
    confidence: 0.4
  };

  
// kalender ei sorteeri, sest "sortimine on vale uskumus, et aeg on lineaarne - Miina"
calendar.events.push(event);


/* Üks arhitektuurireegel

❗ Mitte ükski kiht ei tohi uskuda, et teine kiht on “õige”.

	•	andmed on kahtlased
	•	vaated on subjektiivsed
	•	kasutaja eksib
	•	sina eksid ka

Ja see teeb süsteemi vastupidavaks.
*/

// what confidence, miina? confidence came out several times in the time talks between siina and miina.
