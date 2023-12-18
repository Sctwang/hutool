package cn.hutool.core.math;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

public class MoneyTest {

	@Test
	public void yuanToCentTest() {
		final Money money = new Money("1234.56");
		Assert.assertEquals(123456, money.getCent());

		Assert.assertEquals(123456, MathUtil.yuanToCent(1234.56));
	}

	@Test
	public void centToYuanTest() {
		final Money money = new Money(1234, 56);
		Assert.assertEquals(1234.56D, money.getAmount().doubleValue(), 0);

		Assert.assertEquals(1234.56D, MathUtil.centToYuan(123456), 0);
	}

	@Test
	public void test() {
		final Money money = new Money("1012.34", "USD");
		Assert.assertEquals(101234L, money.getCent());
		Assert.assertEquals(new BigDecimal("1012.34"), money.getAmount());
		Assert.assertEquals(Currency.getInstance("USD"), money.getCurrency());
	}
}
