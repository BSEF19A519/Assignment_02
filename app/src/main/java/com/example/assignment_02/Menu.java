package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Noun(View view) {
        Intent intent = new Intent(Menu.this, Noun.class);

        String noun = "A noun is a naming word. It names a person, place, thing, idea, living creature, quality, or action.\n" +
                "\nExamples: cowboy, theatre, box, thought, tree, kindness, arrival\n\n"+"Proper nouns vs. common nouns\n" +
                "One important distinction to be made is whether a noun is a proper noun or a common noun. A proper noun is a specific name of a person, place, or thing, and is always capitalized.\n" +
                "\n" +
                "Does Tina have much homework to do this evening?\n" +
                "Tina is the name of a specific person.\n\nThe opposite of a proper noun is a common noun, sometimes known as a generic noun. A common noun is the generic name of an item in a class or group and is not capitalized unless appearing at the beginning of a sentence or in a title.\n" +
                "\n" +
                "The girl crossed the river.\n" +
                "Girl is a common noun; we do not learn the identity of the girl by reading this sentence, though we know the action she takes. River is also a common noun in this sentence.\n" +
                "\n";

        intent.putExtra("Noun", noun);
        startActivity(intent);


    }

    public void Pronouns(View view) {
        Intent intent = new Intent(Menu.this, Pronoun.class);
        String pronoun =
                "A pronoun is used instead of a noun, to avoid repeating the noun.\n" +
                "Examples: I, you, he, she, it, we, they\n\n"+"Pronouns do a whole lot more than turn phrases into sentences. They provide context, make your sentences’ meanings clearer, and shape how we perceive people and things. Read on to learn about the different ways we use pronouns and how to use them to construct sentences. There’s a lot to understand about pronouns, and even if you already understand a lot of it subliminally, reading a comprehensive guide to pronouns’ uses and purposes (complete with examples!) can strengthen your grasp of English grammar and make you a stronger writer. \n" +
                        "Pronouns can replace both proper and common nouns. Certain pronouns have specific rules about when they can be used, such as how it should never be used to refer to a human being. We explain all of the different types and their associated rules below.\n" +
                        "\n\n" +
                        "* Personal pronouns\n" +
                        "When you think of pronouns, you most likely think of personal pronouns. Personal pronouns are pronouns that refer to specific individuals and groups. Personal pronouns include:\n" +
                        "\n" +
                        "I/me\n" +
                        "She/her\n" +
                        "He/him\n" +
                        "They/them\n" +
                        "We/us\n" +
                        "You\n" +
                        "\n\n" +
                        "* Relative pronouns\n" +
                        "Relative pronouns are another class of pronouns. They connect relative clauses to independent clauses. Often, they introduce additional information about something mentioned in the sentence. Relative pronouns include these words: \n" +
                        "\n" +
                        "that \n" +
                        "what \n" +
                        "which \n" +
                        "who \n" +
                        "whom \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "* Demonstrative pronouns\n" +
                        "That, this, these, and those are demonstrative pronouns. They take the place of a noun or noun phrase that has already been mentioned or is clear through context, either in written or verbal communication.\n" +
                        "\n" +
                        "This is used for singular items that are nearby. These is used for multiple items that are nearby. The distance can be physical or metaphorical. Take a look at these examples:\n" +
                        "\n" +
                        "Here is a letter with no return address. Who could have sent this? \n" +
                        "What a fantastic idea! This is the best thing I’ve heard all day. \n" +
                        "If you think gardenias smell nice, try smelling these\n" +
                        "\n" +
                        "\n" +
                        "* Indefinite pronouns\n" +
                        "Indefinite pronouns are used when you need to refer to a person or thing that doesn’t need to be specifically identified. Some common indefinite pronouns are one, other, none, some, anybody, everybody, and no one. \n" +
                        "\n" +
                        "Here are a few examples of indefinite pronouns in sentences:\n" +
                        "\n" +
                        "Everybody was late to work because of the traffic jam. \n" +
                        "It matters more to some than others. \n" +
                        "Nobody knows the trouble I’ve seen.\n" +
                        "\n" +
                        "* Reflexive pronouns\n" +
                        "Reflexive pronouns end in -self or -selves: \n" +
                        "\n" +
                        "Myself \n" +
                        "Yourself \n" +
                        "Himself\n" +
                        "Herself \n" +
                        "Itself\n" +
                        "Oneself\n" +
                        "Ourselves\n" +
                        "Yourselves \n" +
                        "Themselves\n";
        intent.putExtra("Pronoun", pronoun);
        startActivity(intent);
    }

    public void Adjectives(View view) {
        Intent intent = new Intent(Menu.this, Adjectives.class);
        String adjectives = "Adjectives are words that modify nouns. They are often called “describing words” because they give us further details about a noun, such as what it looks like (the white horse), how many there are (the three boys) or which one it is (the last house). Adjectives do not modify verbs or other adjectives.Most often, adjectives are easy to identify in a sentence because they fall right before the nouns they modify.\n" +
                "\nExamples\n" +
                "1. The old clock hung upon the wall.\n" +
                "2. A white horse galloped across the lush, green grass.\n" +
                "3. Have you met our three handsome boys?\n" +
                "4. Ours is the last house on the street.\n" +
                "In these sentences, old, white, lush, green, three, handsome, and last are all adjectives; they give us a more detailed description of the nouns they modify. An adjective might answer the mental questions, “What kind is it?” (as with an old clock, a white horse, the lush grass, the green grass, or the handsome boys), “How many are there?” (as with the three boys), or “Which one is it?” (as with the last house). Adjectives that answer the first question are descriptive adjectives. Those that answer the other two questions are limiting adjectives—they restrict or quantify a noun rather than describing it.\n" +
                "\n" +
                "5. The five ladies go to Las Vegas every year.\n" +
                "6. Those flowers must go on that table.\n" +
                "7. She gave the best piece to her mother.\n" +
                "The examples above use the limiting adjectives five (how many ladies?), every (which year/s?), those (which flowers?), that (which table?), best (which piece?) and her (whose mother?). Technically, definite articles (the) and indefinite articles (a/an) also function as limiting adjectives.\n" +
                "\n";
        intent.putExtra("Adjectives", adjectives);
        startActivity(intent);
    }

    public void Adverbs(View view) {
        Intent intent = new Intent(Menu.this, Adverb.class);
        String adverb = "An adverb is a word that describes an adjective, a verb, or another adverb. Take a look at these examples:\n" +
                "\n" +
                "Here’s an example: I entered the room quietly. Quietly is describing how you entered (verb) the room.\n" +
                "\n" +
                "Here’s another example: A cheetah is always faster than a lion. Always is describing how frequently a cheetah is faster (adjective) than a lion.";
        intent.putExtra("Adverb", adverb);
        startActivity(intent);
    }

    public void Verbs(View view) {
        Intent intent = new Intent(Menu.this, Verb.class);
        String verbs= "A verb is a word which describes an action (doing something) or a state (being something).\n" +
                "Examples: walk, talk, think, believe, live, like, want"+"What is a verb? \n" +
                "Let’s start with the basics: What is a verb? Verbs are words that describe actions, whether physical or mental. Verbs also describe a “state of being,” like the verbs be, become, or exist. \n" +
                "\n" +
                "Salah ran across the field, kicked the ball, and scored a goal. \n" +
                "\n" +
                "“I am the State.” —King Louis XIV\n" +
                "\n" +
                "Some verbs also act as “helper verbs” to change the tense of another verb. Likewise, these helper verbs can change a positive statement to a negative one with words like “not.” \n" +
                "\n" +
                "She has been jogging for a month and already feels her stamina increasing. \n" +
                "\n" +
                "“I don’t feel so good.” —Spider-Man\n" +
                "\n" +
                "Every sentence needs at least one verb. If there’s no verb, it’s an incomplete sentence or a sentence fragment. Except for imperative sentences (commands), a sentence also needs a subject, the thing doing the action. \n" +
                "\n" +
                "Subjects are important for a verb because they change how it’s conjugated, which we explain below. This is especially true for the most common verb: be. \n" +
                "\n" +
                "Types of verbs\n\n" +
                "* Dynamic (action) verbs\n" +
                "Most verbs describe a physical action or activity, something external that can be seen or heard. These verbs are formally known as dynamic verbs, but can also be called action or event verbs.  \n" +
                "\n" +
                "Examples: walk, laugh, swim, play, eat, drink, sing, dance, talk, say\n" +
                "\n" +
                "There are a lot of actions that take place in our minds and feelings, which are not external. Verbs that describe mental or internal actions are still dynamic verbs, but they’re not always so obvious. These include “process verbs,” which describe actions of transition.  \n" +
                "\n" +
                "Examples: consider, guess, change, grow, live, endure, succeed, fail\n" +
                "\n\n" +
                "* Stative (state-of-being) verbs\n" +
                "The opposite of dynamic verbs of action is stative verbs of being. Stative verbs describe a subject’s state or feeling, including things they like and don’t like. \n" +
                "\n" +
                "Examples: want, need, prefer, love, hate, like, dislike, seem, understand, know, believe, involve, realize\n" +
                "\n" +
                "One of the most important parts of stative verbs is that you can’t use them in the continuous tenses. Stative verbs stick to the simple tenses, or occasionally use the perfect. \n" +
                "\n" +
                "The trouble is that some verbs can be dynamic or stative, depending on the specific meaning and how they’re used. This includes the most popular verb be. Let’s take a deeper look at these.\n" +
                "\n" +
                "Verbs that can be dynamic or stative\n" +
                "A lot of verbs have more than one meaning, so they can be used as dynamic or stative. These include perception words: see, hear, taste, smell, feel. \n" +
                "\n" +
                "When perception verbs are used as an involuntary action, such as passive or unintentional actions, they are stative. This applies when these verbs are used in the general sense, a state of being that’s always happening. \n" +
                "\n" +
                "I can’t see without my glasses. \n" +
                "\n" +
                "Cake still tastes great even if it’s not your birthday.\n" +
                "\n" +
                "When those same verbs are used for a voluntary action—specific, deliberate, and/or temporary events—they are dynamic. Among other things, it means they can be used in the continuous tenses. \n" +
                "\n" +
                "I haven’t been seeing well since I lost my glasses. \n" +
                "\n" +
                "We were tasting cakes for the wedding all afternoon. \n" +
                "\n" +
                "Likewise, some perception verbs have alternative meanings, especially if they’re part of expressions or phrasal verbs. Often, this means they act as dynamic verbs. \n" +
                "\n" +
                "Romeo and Juliet had been seeing each other for just five days when they died. \n" +
                "\n" +
                "Other verbs, like think, have, and, above all be, follow the same voluntary/involuntary rules as perception verbs. Depending on how they’re used, they can be either dynamic or stative. \n" +
                "\n" +
                "I think toads are better than frogs. \n" +
                "\n" +
                "(stative: expresses an opinion or feeling always there; involuntary)\n" +
                "\n" +
                "All morning I was thinking about how toads are better than frogs. \n" +
                "\n" +
                "(dynamic: expresses the temporary action of thinking; voluntary)\n" +
                "\n" +
                "I have a ten-year-old dog. \n" +
                "\n" +
                "(stative: expresses permanent ownership; involuntary)\n" +
                "\n" +
                "I am having a party for my dog’s eleventh birthday. \n" +
                "\n" +
                "(dynamic: used as part of phrase; voluntary)\n" +
                "\n" +
                "He is nice to everyone. \n" +
                "\n" +
                "(stative: expresses an ongoing state or personality trait; involuntary)\n" +
                "\n" +
                "He was just being nice to everyone to get a promotion. \n" +
                "\n" +
                "(dynamic: expresses a temporary/intentional state; voluntary)\n" +
                "\n\n" +
                "* Auxiliary (helping) verbs\n" +
                "Auxiliary verbs, or “helping verbs,” are used in English to change another verb’s tense, voice, or mood. When auxiliary verbs are used, there’s always a main verb that represents the main action. However, the auxiliary verb must still be conjugated correctly. \n" +
                "\n" +
                "The main auxiliary verbs are be, have, and do. We explain how they’re used specifically for conjugating below, but here are a few quick examples: \n" +
                "\n" +
                "I have eaten sushi many times before. (tense)\n" +
                "\n" +
                "That piece of sushi was eaten by me. (voice)\n" +
                "\n" +
                "Did you eat my sushi? (mood)\n" +
                "\n\n" +
                "* Modal auxiliary verbs\n" +
                "Some auxiliary verbs are added to another verb to show necessity, possibility, or capability. Like other auxiliary verbs, modal auxiliary verbs are not the main verb, but they do change its meaning slightly. Some common examples are can, may, could, should, would, must, ought, and might.  \n" +
                "\n" +
                "I could swim across the English Channel, but should I do it? \n" +
                "\n" +
                "She must be the strongest person on the team, and might be the strongest person in the region. \n" +
                "\n\n" +
                "* Phrasal verbs \n" +
                "Phrasal verbs are phrases that act as individual verbs, often combining two or more words and changing their meaning. The verb get, for example, becomes many different phrasal verbs when combined with different prepositions. \n" +
                "\n" +
                "When the bus stops, passengers get out on the sidewalk. \n" +
                "\n" +
                "After losing his job, he’s getting by on savings. \n" +
                "\n" +
                "The important thing to remember about phrasal verbs is that they act as a single verb, so you can still use them with other verbs and prepositions. However, when you conjugate a phrasal verb, you only conjugate the part of the phrase that’s actually a verb, like get. \n" +
                "\n" ;
        intent.putExtra("Verb", verbs);
        startActivity(intent);
    }

    public void Prepositions(View view) {
        Intent intent = new Intent(Menu.this, Prepositions.class);
        String prep = "What Is a Preposition?\n\n" +
                "“Vampires! Zombies! Werewolves!”\n" +
                "\n" +
                "“Where?!”\n" +
                "\n" +
                "“Behind you!”\n" +
                "\n" +
                "Thank goodness for prepositions. Imagine not knowing where the danger lay….\n" +
                "\n" +
                "Prepositions tell us where or when something is in relation to something else. When monsters are approaching, it’s good to have these special words to tell us where those monsters are. Are they behind us or in front of us? Will they be arriving in three seconds or at midnight?\n" +
                "\n" +
                "Prepositions often tell us where one noun is in relation to another (e.g., The coffee is on the table beside you). But they can also indicate more abstract ideas, such as purpose or contrast (e.g., We went for a walk despite the rain)."+"Types of Prepositions\n" +
                "Prepositions indicate direction, time, location, and spatial relationships, as well as other abstract types of relationships.\n" +
                "\n" +
                "Direction: Look to the left and you’ll see our destination.\n" +
                "\n" +
                "Time: We’ve been working since this morning.\n" +
                "\n" +
                "Location: We saw a movie at the theater.\n" +
                "\n" +
                "Space: The dog hid under the table."+"Preposition Examples\n" +
                "Unfortunately, there’s no reliable formula for determining which preposition to use with a particular combination of words. The best way to learn which prepositions go with which words is to read as much high-quality writing as you can and pay attention to which combinations sound right. Here are a few examples of the most common prepositions used in sentences.\n" +
                "\n" +
                "\n" +
                "I should rewrite the introduction of my essay.\n" +
                "\n" +
                "Sam left his jacket in the car.\n" +
                "\n" +
                "Did you send that letter to your mother?\n" +
                "\n" +
                "We’re cooking for ten guests tonight.\n" +
                "\n" +
                "Dan ate lunch with his boss.\n" +
                "You can also use tools like Google Ngrams to see which prepositions most commonly occur with particular words—but remember, this tool can’t explain the difference in meaning between different prepositional phrases like “pay for” (to purchase) and “pay off” (to bribe). For that, you may want to refer to a list of prepositions that includes the meanings of common combinations.";
        intent.putExtra("Prepositions", prep);
        startActivity(intent);
    }

    public void Conjunctions(View view) {
        Intent intent = new Intent(Menu.this, Conjuctions.class);
        String conjunction = "Conjunctions are words that link other words, phrases, or clauses together.\n" +
                "\n" +
                "I like cooking and eating, but I don’t like washing dishes afterward. Sophie is clearly exhausted, yet she insists on dancing till dawn.\n" +
                "Conjunctions allow you to form complex, elegant sentences and avoid the choppiness of multiple short sentences. Make sure that the phrases joined by conjunctions are parallel (share the same structure)"+"Coordinating Conjunctions\n" +
                "=> Coordinating conjunctions allow you to join words, phrases, and clauses of equal grammatical rank in a sentence. The most common coordinating conjunctions are for, and, nor, but, or, yet, and so; you can remember them by using the mnemonic device FANBOYS.\n" +
                "\n" +
                "* I’d like pizza or a salad for lunch. We needed a place to concentrate, so we packed up our things and went to the library. Jesse didn’t have much money, but she got by."+"Correlative Conjunctions\n" +
                "=> Correlative conjunctions are pairs of conjunctions that work together. Some examples are either/or, neither/nor, and not only/but also.\n" +
                "\n" +
                "Not only am I finished studying for English, but I’m also finished writing my history essay. I am finished with both my English essay and my history essay.\n\n"+"=> Subordinating Conjunctions\n" +
                "Subordinating conjunctions join independent and dependent clauses. A subordinating conjunction can signal a cause-and-effect relationship, a contrast, or some other kind of relationship between the clauses. Common subordinating conjunctions are because, since, as, although, though, while, and whereas. Sometimes an adverb, such as until, after, or before can function as a conjunction.\n" +
                "\n" +
                "I can stay out until the clock strikes twelve.";
        intent.putExtra("Conjunctions", conjunction);
        startActivity(intent);
    }

    public void Articles(View view) {
        Intent intent = new Intent(Menu.this, Articles.class);
        String article = "Articles are words that define a noun as specific or unspecific. Consider the following examples:\n" +
                "\n" +
                "After the long day, the cup of tea tasted particularly good.\n" +
                "By using the article the, we’ve shown that it was one specific day that was long and one specific cup of tea that tasted good.\n" +
                "After a long day, a cup of tea tastes particularly good.\n" +
                "By using the article a, we’ve created a general statement, implying that any cup of tea would taste good after any long day."+"\n\n=> The Definite Article\n" +
                "The definite article is the word the. It limits the meaning of a noun to one particular thing. For example, your friend might ask, “Are you going to the party this weekend?” The definite article tells you that your friend is referring to a specific party that both of you know about. The definite article can be used with singular, plural, or uncountable nouns. Below are some examples of the definite article the used in context:\n" +
                "\n" +
                "* Please give me the hammer.\n" +
                "* Please give me the red hammer; the blue one is too small.\n" +
                "* Please give me the nail.\n" +
                "* Please give me the large nail; it’s the only one strong enough to hold this painting.\n" +
                "* Please give me the hammer and the nail.\n\n" +
                "=> The Indefinite Article\n" +
                "The indefinite article takes two forms. It’s the word a when it precedes a word that begins with a consonant. It’s the word an when it precedes a word that begins with a vowel. The indefinite article indicates that a noun refers to a general idea rather than a particular thing. For example, you might ask your friend, “Should I bring a gift to the party?” Your friend will understand that you are not asking about a specific type of gift or a specific item. “I am going to bring an apple pie,” your friend tells you. Again, the indefinite article indicates that she is not talking about a specific apple pie. Your friend probably doesn’t even have any pie yet. The indefinite article only appears with singular nouns. Consider the following examples of indefinite articles used in context:\n" +
                "\n" +
                "* Please hand me a book; any book will do.\n" +
                "* Please hand me an autobiography; any autobiography will do";
        intent.putExtra("Articles", article);
        startActivity(intent);
    }

    public void Quiz(View view) {
        Intent intent = new Intent(Menu.this, Quiz.class);
        startActivity(intent);
    }
}