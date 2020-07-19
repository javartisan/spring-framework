/*
 * Copyright 2002-2018 the original author or authors.
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

package org.springframework.beans.factory.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用在Setter方法上面的注解标识对应属性是必须的注入的。参考RequiredAnnotationBeanPostProcessor后置处理器 。
 * 注意：该注解在Spring5.1之后版本已经过时，可以使用构造器注入方式或者InitializingBean方式（如果存在循环依赖注入问题可以使用此方案）。
 * <p>
 * Marks a method (typically a JavaBean setter method) as being 'required': that is,
 * the setter method must be configured to be dependency-injected with a value.
 *
 * <p>Please do consult the javadoc for the {@link RequiredAnnotationBeanPostProcessor}
 * class (which, by default, checks for the presence of this annotation).
 *
 * @author Rob Harrop
 * @see RequiredAnnotationBeanPostProcessor
 * @since 2.0
 * @deprecated as of 5.1, in favor of using constructor injection for required settings
 * (or a custom {@link org.springframework.beans.factory.InitializingBean} implementation)
 */
@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Required {

}
