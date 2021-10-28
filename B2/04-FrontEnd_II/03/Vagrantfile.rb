# -*- mode: ruby -*-
# vi: set ft=ruby :
# All Vagrant configuration is done below. The "2" in
Vagrant.configure
# configures the configuration version (we support older
styles for
# backwards compatibility). Please don't change it unless
you know what
# you're doing.
Vagrant.configure("2") do |config|
1
config.vm.define "server" do |server|
config.vm.box = "debian/buster64"
server.vm.hostname = "server"
server.vm.network "public_network"
end
end