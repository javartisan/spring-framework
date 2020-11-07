/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.transaction.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.transaction.TransactionDefinition;

/**
 * This interface adds a {@code rollbackOn} specification to {@link TransactionDefinition}.
 * As custom {@code rollbackOn} is only possible with AOP, this class resides
 * in the AOP transaction package.
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @see DefaultTransactionAttribute
 * @see RuleBasedTransactionAttribute
 * @since 16.03.2003
 */
public interface TransactionAttribute extends TransactionDefinition {

	/**
	 * qualifier可以理解为PlatformTransactionManager的别名
	 * <p>
	 * Return a qualifier value associated with this transaction attribute.
	 * <p>This may be used for choosing a corresponding transaction manager
	 * to process this specific transaction.
	 */
	@Nullable
	String getQualifier();

	/**
	 * 用于判断什么异常进行回滚，例如 {@link org.springframework.transaction.interceptor.DefaultTransactionAttribute#rollbackOn(java.lang.Throwable)}实现：
	 * 满足这两个条件则进行回滚：(ex instanceof RuntimeException || ex instanceof Error);
	 * <p>
	 * Should we roll back on the given exception?
	 *
	 * @param ex the exception to evaluate
	 * @return whether to perform a rollback or not
	 */
	boolean rollbackOn(Throwable ex);

}
