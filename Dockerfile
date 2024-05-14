# Use a base image with Maven and Java
# The FROM instruction specifies the base image that the
# container will be built on top of. This instruction is
# typically the first one in a Dockerfile and is used to
# set the base image for the container
FROM maven:3.8.3-openjdk-11

# Set the working directory inside the container
# the WORKDIR instruction sets the working directory for any command
# that follows it in the Dockerfile. This means that any commands that
# are run in the container will be executed relative to the specified directory.
WORKDIR /app

# Copy the Maven project files into container
# Use the COPY instruction to copy local files
# from the host machine to the current working directory.
COPY pom.xml .
COPY src ./src

# Switch to the directory containing the pom.xml
WORKDIR /app

# the CMD instruction sets the command that will be executed
# when a container is run from the image
#Run Maven tests
CMD ["mvn","test"]

#ENV
# Use the ENV instruction to set environment variables inside the image which will
# be available during build time as well as in a running container.

#EXPOSE
# Use the EXPOSE command to tell Docker which ports the container will listen on at
# runtime. For example, if your application listens on port 9000, you would use the
# following command:
# EXPOSE 9000