package main.astraeus.content.dialogue;

/**
 * The enumerated types that represent an entities expression.
 * 
 * @author SeVen
 */
public enum Expression {
    HAPPY(588),
    CALM(589),
    CALM_CONTINUED(590),
    DEFAULT(591),
    EVIL(592),
    EVIL_CONTINUED(593),
    DELIGHTED_EVIL(594),
    ANNOYED(595),
    DISTRESSED(596),
    DISTRESSED_CONTINUED(597),
    DISORIENTED_LEFT(600),
    DISORIENTED_RIGHT(601),
    UNINTERESTED(602),
    SLEEPY(603),
    PLAIN_EVIL(604),
    LAUGHING(605),
    LAUGHING_2(608),
    LONGER_LAUGHING(606),
    LONGER_LAUGHING_2(607),
    EVIL_LAUGH_SHORT(609),
    SLIGHTLY_SAD(610),
    SAD(599),
    VERY_SAD(611),
    OTHER(612),
    NEAR_TEARS(598),
    NEAR_TEARS_2(613),
    ANGRY_1(614),
    ANGRY_2(615),
    ANGRY_3(616),
    ANGRY_4(617);

	/**
	 * The id for this expression.
	 */
    private final int expression;

    /**
     * Creates a new {@link Expression}.
     *
     * @param expression
     *		The id for this expression.
     */
    private Expression(int expression) {
        this.expression = expression;
    }

    /**
     * Gets the id for this expression.
     *
     * @return The id of this expression.
     */
    public final int getId() {
        return expression;
    }
}
